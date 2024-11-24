const express = require('express');
const oracledb = require('oracledb');
const path = require('path');

const app = express();
const PORT = 3000;

// Oracle DB 연결 설정
const dbConfig = {
  user: 'c#imstwo',          // Oracle 사용자 이름
  password: 'korea2',      // Oracle 비밀번호
  connectString: 'localhost:1521/testdb'  // Oracle 연결 문자열
};

// 정적 파일 제공 설정
app.use(express.static(path.join(__dirname, 'public')));

// /inventory API 생성
app.get('/inventory', async (req, res) => {
  let connection;

  try {
    connection = await oracledb.getConnection(dbConfig);

    // inventory 테이블의 모든 데이터를 조회하는 쿼리
    const result = await connection.execute('SELECT * FROM inventory');

    // JSON으로 데이터를 반환
    res.json(result.rows);
  } catch (error) {
    console.error('Oracle DB 연결 오류:', error);
    res.status(500).send('서버 오류');
  } finally {
    if (connection) {
      try {
        await connection.close();
      } catch (closeError) {
        console.error('Oracle DB 연결 종료 오류:', closeError);
      }
    }
  }
});

// 기본 경로로 접속 시 list.html 파일을 제공
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'list.html'));
});

// /sales API 수정
app.get('/sales', async (req, res) => {
  let connection;

  try {
    connection = await oracledb.getConnection(dbConfig);

    // sales 테이블에서 데이터 조회
    const result = await connection.execute(`
      SELECT 
        s.sale_id, 
        s.product_id, 
        s.sale_quantity, 
        TO_CHAR(s.sale_date, 'YYYY-MM-DD') AS sale_date, -- 날짜 포맷 지정
        s.total_price 
      FROM sales s
    `);

    // JSON으로 데이터를 반환
    res.json(result.rows.map(row => ({
      sale_id: row[0],
      product_id: row[1], // 물품 ID 반환
      sale_quantity: row[2],
      sale_date: row[3], // 포맷된 날짜
      total_price: row[4]
    })));
  } catch (error) {
    console.error('Oracle DB 연결 오류:', error);
    res.status(500).send('서버 오류');
  } finally {
    if (connection) {
      try {
        await connection.close();
      } catch (closeError) {
        console.error('Oracle DB 연결 종료 오류:', closeError);
      }
    }
  }
});



// 기본 경로로 접속 시 list.html 파일 제공
app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'list.html'));
});

// /mypage 경로로 접속 시 mypage.html 파일 제공
app.get('/mypage', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'mypage.html'));
});


// 서버 시작
app.listen(PORT, () => {
  console.log(`서버가 http://localhost:${PORT} 에서 실행 중입니다`);
}); 



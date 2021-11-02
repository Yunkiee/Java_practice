import React, {Component} from "react";
import Task from '../../components/task';
import {Table, TableBody, TableCell, TableHead, TableRow} from "@material-ui/core";

const sample = [
    {
        'id': 1,
        'name': '1번작업',
        'cron': '0 9 * * *',
        'log': '2020-10-01 ~ 2020-10-07',
        'lastTime': '2020-10-08',
        'latestReport': '2020-10-08',
        'update': '수정'
    }
];

class Home extends Component {
    render() {
        return (
            <div>
                <Table>
                    <TableHead>
                        <TableRow>
                            <TableCell>번호</TableCell>
                            <TableCell>이름</TableCell>
                            <TableCell>크론</TableCell>
                            <TableCell>로그</TableCell>
                            <TableCell>마지막 실행 시간</TableCell>
                            <TableCell>최근 보고서</TableCell>
                            <TableCell>수정 버튼</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {sample.map(c => {
                            return <Task key={c.id} id={c.id} name={c.name} cron={c.cron} log={c.log}
                                         lastTime={c.lastTime} latestReport={c.latestReport} update={c.update}></Task>
                        })}
                    </TableBody>
                </Table>
            </div>
        );
    }
}

export default Home;
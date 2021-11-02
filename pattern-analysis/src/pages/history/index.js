import React, {Component} from "react";
import {Table, TableBody, TableCell, TableHead, TableRow} from "@material-ui/core";
import Result from "../../components/result";

const sample = [
    {
        'id': 1,
        'taskName': 'UXLog-report-ver2',
        'startTime': '2021-11-02 10:30:00',
        'endTime': '2020-11-01 10:45:00 ',
        'result': 'success',
        'report': 'C:\\download\\report1.img'
    }
];

class History extends Component {
    render() {
        return (
            <div>
                <Table>
                    <TableHead>
                        <TableRow>
                            <TableCell>번호</TableCell>
                            <TableCell>분석 작업</TableCell>
                            <TableCell>시작 시간</TableCell>
                            <TableCell>종료 시간</TableCell>
                            <TableCell>상태</TableCell>
                            <TableCell>보고서 보기</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {sample.map(c => {
                            return <Result key={c.id} id={c.id} taskName={c.taskName} startTime={c.startTime} endTime={c.endTime} result={c.result}
                                         report={c.report}></Result>
                        })}
                    </TableBody>
                </Table>
            </div>
        );
    }
}

export default History;
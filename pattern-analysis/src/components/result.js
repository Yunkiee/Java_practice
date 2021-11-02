import React, {Component} from 'react';
import {Table, TableCell, TableHead, TableBody, TableRow} from '@material-ui/core';

class Result extends React.Component {
    render() {
        return (
            <TableRow>
                <TableCell>{this.props.id}</TableCell>
                <TableCell>{this.props.taskName}</TableCell>
                <TableCell>{this.props.startTime}</TableCell>
                <TableCell>{this.props.endTime}</TableCell>
                <TableCell>{this.props.result}</TableCell>
                <TableCell>{this.props.report}</TableCell>
            </TableRow>
        );
    }
}

export default Result;
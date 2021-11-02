import React, {Component} from 'react';
import {Table, TableCell, TableHead, TableBody, TableRow} from '@material-ui/core';

class Task extends React.Component {
    render() {
        return (
            <TableRow>
                <TableCell>{this.props.id}</TableCell>
                <TableCell>{this.props.name}</TableCell>
                <TableCell>{this.props.cron}</TableCell>
                <TableCell>{this.props.log}</TableCell>
                <TableCell>{this.props.lastTime}</TableCell>
                <TableCell>{this.props.latestReport}</TableCell>
                <TableCell>{this.props.update}</TableCell>
            </TableRow>
        );
    }
}

export default Task;
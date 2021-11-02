import React, {Component} from "react";
import Task from '../../components/task';
import {Box, Button, Grid, Table, TableBody, TableCell, TableHead, TableRow, TextField} from "@material-ui/core";

class Register extends Component {
    render() {
        return (
            <div>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>이름</Box>
                    </Grid>
                    <Grid item>
                        <Box>
                            <TextField></TextField>
                        </Box>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>작업주기</Box>
                    </Grid>
                    <Grid item>
                        <Box>
                            <TextField></TextField>
                        </Box>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>로그기간</Box>
                    </Grid>
                    <Grid item>
                        <Box>
                            <TextField></TextField>
                        </Box>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>Github URL</Box>
                    </Grid>
                    <Grid item>
                        <Box>
                            <TextField></TextField>
                        </Box>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>로켓챗ID</Box>
                    </Grid>
                    <Grid item>
                        <Box>
                            <TextField></TextField>
                        </Box>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>s3 버킷</Box>
                    </Grid>
                    <Grid item>
                        <Box>
                            <TextField></TextField>
                        </Box>
                    </Grid>
                </Grid>
                <Grid container>
                    <Grid item>
                        <Box align={"right"}>
                            <Button>저장</Button>
                            <Button>취소</Button>
                        </Box>
                    </Grid>
                </Grid>
            </div>
        );
    }
}

export default Register;
import React, { useState } from 'react'
import Button from 'react-bootstrap/Button'
import Stack from 'react-bootstrap/Stack'

export default function Counter() {
    const [ counter, setCounter ] = useState(0);

    return (
        <Stack gap={2} className="col-md-5 mx-auto ">
            <Button variant="primary" onClick={() => {setCounter(counter + 1)}}>Counter = {counter}</Button>
        </Stack>
    )
}

/**
 * Se crea la clase cardBingo encargada de generar un tarjetonBingo para enviar al BackEnd
 */
class cardBingo {
  b0 = 0;
  b1 = 0;
  b2 = 0;
  b3 = 0;
  b4 = 0;
  i0 = 0;
  i1 = 0;
  i2 = 0;
  i3 = 0;
  i4 = 0;
  n0 = 0;
  n1 = 0;
  n3 = 0;
  n4 = 0;
  g0 = 0;
  g1 = 0;
  g2 = 0;
  g3 = 0;
  g4 = 0;
  o0 = 0;
  o1 = 0;
  o2 = 0;
  o3 = 0;
  o4 = 0;

  setB0(num) {
    this.b0 = num;
  }
  setB1(num) {
    this.b1 = num;
  }
  setB2(num) {
    this.b2 = num;
  }
  setB3(num) {
    this.b3 = num;
  }
  setB3(num) {
    this.b4 = num;
  }
  setI0(num) {
    this.i0 = num;
  }
  setI1(num) {
    this.i1 = num;
  }
  setI2(num) {
    this.i2 = num;
  }
  setI3(num) {
    this.i3 = num;
  }
  setI4(num) {
    this.i4 = num;
  }
  setN0(num) {
    this.n0 = num;
  }
  setN1(num) {
    this.n1 = num;
  }
  setN3(num) {
    this.n3 = num;
  }
  setN4(num) {
    this.n4 = num;
  }
  setG0(num) {
    this.G0 = num;
  }
  setG1(num) {
    this.G1 = num;
  }
  setG2(num) {
    this.G2 = num;
  }
  setG3(num) {
    this.G3 = num;
  }
  setG4(num) {
    this.G4 = num;
  }
  setO0(num) {
    this.o0 = num;
  }
  setO1(num) {
    this.o1 = num;
  }
  setO2(num) {
    this.o2 = num;
  }
  setO3(num) {
    this.o3 = num;
  }
  setO4(num) {
    this.o4 = num;
  }
  jsonCargBingo() {
    let varJson = {
        filaB: [
          {
            b0: this.b0,
            b1: this.b1,
            b2: this.b2,
            b3: this.b3,
            b4: this.b4
          }
        ],
        filaI: [
          {
            i0: this.i0,
            i1: this.i1,
            i2: this.i2,
            i3: this.i3,
            i4: this.i4
          }
        ],
        filaN: [
          {
            n0: this.n0,
            n1: this.n1,
            n3: this.n3,
            n4: this.n4
          }
        ],
        filaG: [
          {
            g0: this.g0,
            g1: this.g1,
            g2: this.g2,
            g3: this.g3,
            g4: this.g4
          }
        ],
        filaO: [
          {
            o0: this.o0,
            o1: this.o1,
            o2: this.o2,
            o3: this.o3,
            o4: this.o4
          }
        ],
    };
    return varJson;
  }
}
export default cardBingo;

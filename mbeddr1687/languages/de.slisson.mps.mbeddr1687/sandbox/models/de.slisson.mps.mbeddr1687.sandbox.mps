<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7f53d953-c32f-4ad5-b237-4204cef6021e(de.slisson.mps.mbeddr1687.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="356351fd-bd41-4ac3-90a6-3afbbb7a6831" name="de.slisson.mps.mbeddr1687" version="-1" />
  </languages>
  <imports />
  <registry>
    <language id="356351fd-bd41-4ac3-90a6-3afbbb7a6831" name="de.slisson.mps.mbeddr1687">
      <concept id="2625034889953780755" name="de.slisson.mps.mbeddr1687.structure.NumberLiteral" flags="ng" index="IR_H0">
        <property id="2625034889953780756" name="value" index="IR_H7" />
      </concept>
      <concept id="2625034889953780665" name="de.slisson.mps.mbeddr1687.structure.ExpressionStatement" flags="ng" index="IR_NE">
        <child id="2625034889953780667" name="expr" index="IR_NC" />
      </concept>
      <concept id="2625034889953780664" name="de.slisson.mps.mbeddr1687.structure.StatementList" flags="ng" index="IR_NF">
        <child id="2625034889953780678" name="statements" index="IR_Ml" />
      </concept>
      <concept id="2625034889953770728" name="de.slisson.mps.mbeddr1687.structure.Method" flags="ng" index="IRCeV">
        <child id="2625034889953780672" name="body" index="IR_Mj" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="IRCeV" id="2hHZPcaHGh9">
    <property role="TrG5h" value="M1" />
    <node concept="IR_NF" id="2hHZPcaHGha" role="IR_Mj">
      <node concept="IR_NE" id="2hHZPcaIIFW" role="IR_Ml">
        <node concept="IR_H0" id="2hHZPcaIIFV" role="IR_NC">
          <property role="IR_H7" value="12" />
        </node>
      </node>
    </node>
  </node>
</model>


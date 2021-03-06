package de.slisson.mps.mbeddr1687.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (index_xbvbvu_a0a.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new ExpressionStatement_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new Method_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new NumberLiteral_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new StatementList_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (index_xbvbvu_a0d.index(cncpt)) {
      case 0:
        return Collections.<TransformationMenu>singletonList(new template_GrammarCellsSideTransformationsMenu());
      default:
    }
    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (index_xbvbvu_a0e.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Expression());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ExpressionStatement());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Method());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_NumberLiteral());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Statement());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StatementList());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex index_xbvbvu_a0a = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a3b9L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab37ce8L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a413L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a3b8L)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0d = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).seal();
  private static final ConceptSwitchIndex index_xbvbvu_a0e = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a3baL), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a3b9L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab37ce8L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a413L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a3c5L), MetaIdFactory.conceptId(0x356351fdbd414ac3L, 0x90a63afbbb7a6831L, 0x246dff530ab3a3b8L)).seal();
}

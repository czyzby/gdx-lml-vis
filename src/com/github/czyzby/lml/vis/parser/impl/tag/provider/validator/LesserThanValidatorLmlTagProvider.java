package com.github.czyzby.lml.vis.parser.impl.tag.provider.validator;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.parser.tag.LmlTagProvider;
import com.github.czyzby.lml.vis.parser.impl.tag.validator.LesserThanValidatorLmlTag;

/** Provides lesser than validator tags.
 *
 * @author MJ */
public class LesserThanValidatorLmlTagProvider implements LmlTagProvider {
    @Override
    public LmlTag create(final LmlParser parser, final LmlTag parentTag, final String rawTagData) {
        return new LesserThanValidatorLmlTag(parser, parentTag, rawTagData);
    }
}

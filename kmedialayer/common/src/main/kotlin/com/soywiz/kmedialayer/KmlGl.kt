// WARNING: File autogenerated DO NOT modify
// https://www.khronos.org/registry/OpenGL/api/GLES2/gl2.h
@file:Suppress("unused", "RedundantUnitReturnType")

package com.soywiz.kmedialayer

abstract class KmlGl {
    val DEPTH_BUFFER_BIT: Int get() = 0x0100
    val STENCIL_BUFFER_BIT: Int get() = 0x0400
    val COLOR_BUFFER_BIT: Int get() = 0x4000
    val FALSE: Int get() = 0x0000
    val TRUE: Int get() = 0x0001
    val POINTS: Int get() = 0x0000
    val LINES: Int get() = 0x0001
    val LINE_LOOP: Int get() = 0x0002
    val LINE_STRIP: Int get() = 0x0003
    val TRIANGLES: Int get() = 0x0004
    val TRIANGLE_STRIP: Int get() = 0x0005
    val TRIANGLE_FAN: Int get() = 0x0006
    val ZERO: Int get() = 0x0000
    val ONE: Int get() = 0x0001
    val SRC_COLOR: Int get() = 0x0300
    val ONE_MINUS_SRC_COLOR: Int get() = 0x0301
    val SRC_ALPHA: Int get() = 0x0302
    val ONE_MINUS_SRC_ALPHA: Int get() = 0x0303
    val DST_ALPHA: Int get() = 0x0304
    val ONE_MINUS_DST_ALPHA: Int get() = 0x0305
    val DST_COLOR: Int get() = 0x0306
    val ONE_MINUS_DST_COLOR: Int get() = 0x0307
    val SRC_ALPHA_SATURATE: Int get() = 0x0308
    val FUNC_ADD: Int get() = 0x8006
    val BLEND_EQUATION: Int get() = 0x8009
    val BLEND_EQUATION_RGB: Int get() = 0x8009
    val BLEND_EQUATION_ALPHA: Int get() = 0x883D
    val FUNC_SUBTRACT: Int get() = 0x800A
    val FUNC_REVERSE_SUBTRACT: Int get() = 0x800B
    val BLEND_DST_RGB: Int get() = 0x80C8
    val BLEND_SRC_RGB: Int get() = 0x80C9
    val BLEND_DST_ALPHA: Int get() = 0x80CA
    val BLEND_SRC_ALPHA: Int get() = 0x80CB
    val CONSTANT_COLOR: Int get() = 0x8001
    val ONE_MINUS_CONSTANT_COLOR: Int get() = 0x8002
    val CONSTANT_ALPHA: Int get() = 0x8003
    val ONE_MINUS_CONSTANT_ALPHA: Int get() = 0x8004
    val BLEND_COLOR: Int get() = 0x8005
    val ARRAY_BUFFER: Int get() = 0x8892
    val ELEMENT_ARRAY_BUFFER: Int get() = 0x8893
    val ARRAY_BUFFER_BINDING: Int get() = 0x8894
    val ELEMENT_ARRAY_BUFFER_BINDING: Int get() = 0x8895
    val STREAM_DRAW: Int get() = 0x88E0
    val STATIC_DRAW: Int get() = 0x88E4
    val DYNAMIC_DRAW: Int get() = 0x88E8
    val BUFFER_SIZE: Int get() = 0x8764
    val BUFFER_USAGE: Int get() = 0x8765
    val CURRENT_VERTEX_ATTRIB: Int get() = 0x8626
    val FRONT: Int get() = 0x0404
    val BACK: Int get() = 0x0405
    val FRONT_AND_BACK: Int get() = 0x0408
    val TEXTURE_2D: Int get() = 0x0DE1
    val CULL_FACE: Int get() = 0x0B44
    val BLEND: Int get() = 0x0BE2
    val DITHER: Int get() = 0x0BD0
    val STENCIL_TEST: Int get() = 0x0B90
    val DEPTH_TEST: Int get() = 0x0B71
    val SCISSOR_TEST: Int get() = 0x0C11
    val POLYGON_OFFSET_FILL: Int get() = 0x8037
    val SAMPLE_ALPHA_TO_COVERAGE: Int get() = 0x809E
    val SAMPLE_COVERAGE: Int get() = 0x80A0
    val NO_ERROR: Int get() = 0x0000
    val INVALID_ENUM: Int get() = 0x0500
    val INVALID_VALUE: Int get() = 0x0501
    val INVALID_OPERATION: Int get() = 0x0502
    val OUT_OF_MEMORY: Int get() = 0x0505
    val CW: Int get() = 0x0900
    val CCW: Int get() = 0x0901
    val LINE_WIDTH: Int get() = 0x0B21
    val ALIASED_POINT_SIZE_RANGE: Int get() = 0x846D
    val ALIASED_LINE_WIDTH_RANGE: Int get() = 0x846E
    val CULL_FACE_MODE: Int get() = 0x0B45
    val FRONT_FACE: Int get() = 0x0B46
    val DEPTH_RANGE: Int get() = 0x0B70
    val DEPTH_WRITEMASK: Int get() = 0x0B72
    val DEPTH_CLEAR_VALUE: Int get() = 0x0B73
    val DEPTH_FUNC: Int get() = 0x0B74
    val STENCIL_CLEAR_VALUE: Int get() = 0x0B91
    val STENCIL_FUNC: Int get() = 0x0B92
    val STENCIL_FAIL: Int get() = 0x0B94
    val STENCIL_PASS_DEPTH_FAIL: Int get() = 0x0B95
    val STENCIL_PASS_DEPTH_PASS: Int get() = 0x0B96
    val STENCIL_REF: Int get() = 0x0B97
    val STENCIL_VALUE_MASK: Int get() = 0x0B93
    val STENCIL_WRITEMASK: Int get() = 0x0B98
    val STENCIL_BACK_FUNC: Int get() = 0x8800
    val STENCIL_BACK_FAIL: Int get() = 0x8801
    val STENCIL_BACK_PASS_DEPTH_FAIL: Int get() = 0x8802
    val STENCIL_BACK_PASS_DEPTH_PASS: Int get() = 0x8803
    val STENCIL_BACK_REF: Int get() = 0x8CA3
    val STENCIL_BACK_VALUE_MASK: Int get() = 0x8CA4
    val STENCIL_BACK_WRITEMASK: Int get() = 0x8CA5
    val VIEWPORT: Int get() = 0x0BA2
    val SCISSOR_BOX: Int get() = 0x0C10
    val COLOR_CLEAR_VALUE: Int get() = 0x0C22
    val COLOR_WRITEMASK: Int get() = 0x0C23
    val UNPACK_ALIGNMENT: Int get() = 0x0CF5
    val PACK_ALIGNMENT: Int get() = 0x0D05
    val MAX_TEXTURE_SIZE: Int get() = 0x0D33
    val MAX_VIEWPORT_DIMS: Int get() = 0x0D3A
    val SUBPIXEL_BITS: Int get() = 0x0D50
    val RED_BITS: Int get() = 0x0D52
    val GREEN_BITS: Int get() = 0x0D53
    val BLUE_BITS: Int get() = 0x0D54
    val ALPHA_BITS: Int get() = 0x0D55
    val DEPTH_BITS: Int get() = 0x0D56
    val STENCIL_BITS: Int get() = 0x0D57
    val POLYGON_OFFSET_UNITS: Int get() = 0x2A00
    val POLYGON_OFFSET_FACTOR: Int get() = 0x8038
    val TEXTURE_BINDING_2D: Int get() = 0x8069
    val SAMPLE_BUFFERS: Int get() = 0x80A8
    val SAMPLES: Int get() = 0x80A9
    val SAMPLE_COVERAGE_VALUE: Int get() = 0x80AA
    val SAMPLE_COVERAGE_INVERT: Int get() = 0x80AB
    val NUM_COMPRESSED_TEXTURE_FORMATS: Int get() = 0x86A2
    val COMPRESSED_TEXTURE_FORMATS: Int get() = 0x86A3
    val DONT_CARE: Int get() = 0x1100
    val FASTEST: Int get() = 0x1101
    val NICEST: Int get() = 0x1102
    val GENERATE_MIPMAP_HINT: Int get() = 0x8192
    val BYTE: Int get() = 0x1400
    val UNSIGNED_BYTE: Int get() = 0x1401
    val SHORT: Int get() = 0x1402
    val UNSIGNED_SHORT: Int get() = 0x1403
    val INT: Int get() = 0x1404
    val UNSIGNED_INT: Int get() = 0x1405
    val FLOAT: Int get() = 0x1406
    val FIXED: Int get() = 0x140C
    val DEPTH_COMPONENT: Int get() = 0x1902
    val ALPHA: Int get() = 0x1906
    val RGB: Int get() = 0x1907
    val RGBA: Int get() = 0x1908
    val LUMINANCE: Int get() = 0x1909
    val LUMINANCE_ALPHA: Int get() = 0x190A
    val UNSIGNED_SHORT_4_4_4_4: Int get() = 0x8033
    val UNSIGNED_SHORT_5_5_5_1: Int get() = 0x8034
    val UNSIGNED_SHORT_5_6_5: Int get() = 0x8363
    val FRAGMENT_SHADER: Int get() = 0x8B30
    val VERTEX_SHADER: Int get() = 0x8B31
    val MAX_VERTEX_ATTRIBS: Int get() = 0x8869
    val MAX_VERTEX_UNIFORM_VECTORS: Int get() = 0x8DFB
    val MAX_VARYING_VECTORS: Int get() = 0x8DFC
    val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int get() = 0x8B4D
    val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int get() = 0x8B4C
    val MAX_TEXTURE_IMAGE_UNITS: Int get() = 0x8872
    val MAX_FRAGMENT_UNIFORM_VECTORS: Int get() = 0x8DFD
    val SHADER_TYPE: Int get() = 0x8B4F
    val DELETE_STATUS: Int get() = 0x8B80
    val LINK_STATUS: Int get() = 0x8B82
    val VALIDATE_STATUS: Int get() = 0x8B83
    val ATTACHED_SHADERS: Int get() = 0x8B85
    val ACTIVE_UNIFORMS: Int get() = 0x8B86
    val ACTIVE_UNIFORM_MAX_LENGTH: Int get() = 0x8B87
    val ACTIVE_ATTRIBUTES: Int get() = 0x8B89
    val ACTIVE_ATTRIBUTE_MAX_LENGTH: Int get() = 0x8B8A
    val SHADING_LANGUAGE_VERSION: Int get() = 0x8B8C
    val CURRENT_PROGRAM: Int get() = 0x8B8D
    val NEVER: Int get() = 0x0200
    val LESS: Int get() = 0x0201
    val EQUAL: Int get() = 0x0202
    val LEQUAL: Int get() = 0x0203
    val GREATER: Int get() = 0x0204
    val NOTEQUAL: Int get() = 0x0205
    val GEQUAL: Int get() = 0x0206
    val ALWAYS: Int get() = 0x0207
    val KEEP: Int get() = 0x1E00
    val REPLACE: Int get() = 0x1E01
    val INCR: Int get() = 0x1E02
    val DECR: Int get() = 0x1E03
    val INVERT: Int get() = 0x150A
    val INCR_WRAP: Int get() = 0x8507
    val DECR_WRAP: Int get() = 0x8508
    val VENDOR: Int get() = 0x1F00
    val RENDERER: Int get() = 0x1F01
    val VERSION: Int get() = 0x1F02
    val EXTENSIONS: Int get() = 0x1F03
    val NEAREST: Int get() = 0x2600
    val LINEAR: Int get() = 0x2601
    val NEAREST_MIPMAP_NEAREST: Int get() = 0x2700
    val LINEAR_MIPMAP_NEAREST: Int get() = 0x2701
    val NEAREST_MIPMAP_LINEAR: Int get() = 0x2702
    val LINEAR_MIPMAP_LINEAR: Int get() = 0x2703
    val TEXTURE_MAG_FILTER: Int get() = 0x2800
    val TEXTURE_MIN_FILTER: Int get() = 0x2801
    val TEXTURE_WRAP_S: Int get() = 0x2802
    val TEXTURE_WRAP_T: Int get() = 0x2803
    val TEXTURE: Int get() = 0x1702
    val TEXTURE_CUBE_MAP: Int get() = 0x8513
    val TEXTURE_BINDING_CUBE_MAP: Int get() = 0x8514
    val TEXTURE_CUBE_MAP_POSITIVE_X: Int get() = 0x8515
    val TEXTURE_CUBE_MAP_NEGATIVE_X: Int get() = 0x8516
    val TEXTURE_CUBE_MAP_POSITIVE_Y: Int get() = 0x8517
    val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int get() = 0x8518
    val TEXTURE_CUBE_MAP_POSITIVE_Z: Int get() = 0x8519
    val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int get() = 0x851A
    val MAX_CUBE_MAP_TEXTURE_SIZE: Int get() = 0x851C
    val TEXTURE0: Int get() = 0x84C0
    val TEXTURE1: Int get() = 0x84C1
    val TEXTURE2: Int get() = 0x84C2
    val TEXTURE3: Int get() = 0x84C3
    val TEXTURE4: Int get() = 0x84C4
    val TEXTURE5: Int get() = 0x84C5
    val TEXTURE6: Int get() = 0x84C6
    val TEXTURE7: Int get() = 0x84C7
    val TEXTURE8: Int get() = 0x84C8
    val TEXTURE9: Int get() = 0x84C9
    val TEXTURE10: Int get() = 0x84CA
    val TEXTURE11: Int get() = 0x84CB
    val TEXTURE12: Int get() = 0x84CC
    val TEXTURE13: Int get() = 0x84CD
    val TEXTURE14: Int get() = 0x84CE
    val TEXTURE15: Int get() = 0x84CF
    val TEXTURE16: Int get() = 0x84D0
    val TEXTURE17: Int get() = 0x84D1
    val TEXTURE18: Int get() = 0x84D2
    val TEXTURE19: Int get() = 0x84D3
    val TEXTURE20: Int get() = 0x84D4
    val TEXTURE21: Int get() = 0x84D5
    val TEXTURE22: Int get() = 0x84D6
    val TEXTURE23: Int get() = 0x84D7
    val TEXTURE24: Int get() = 0x84D8
    val TEXTURE25: Int get() = 0x84D9
    val TEXTURE26: Int get() = 0x84DA
    val TEXTURE27: Int get() = 0x84DB
    val TEXTURE28: Int get() = 0x84DC
    val TEXTURE29: Int get() = 0x84DD
    val TEXTURE30: Int get() = 0x84DE
    val TEXTURE31: Int get() = 0x84DF
    val ACTIVE_TEXTURE: Int get() = 0x84E0
    val REPEAT: Int get() = 0x2901
    val CLAMP_TO_EDGE: Int get() = 0x812F
    val MIRRORED_REPEAT: Int get() = 0x8370
    val FLOAT_VEC2: Int get() = 0x8B50
    val FLOAT_VEC3: Int get() = 0x8B51
    val FLOAT_VEC4: Int get() = 0x8B52
    val INT_VEC2: Int get() = 0x8B53
    val INT_VEC3: Int get() = 0x8B54
    val INT_VEC4: Int get() = 0x8B55
    val BOOL: Int get() = 0x8B56
    val BOOL_VEC2: Int get() = 0x8B57
    val BOOL_VEC3: Int get() = 0x8B58
    val BOOL_VEC4: Int get() = 0x8B59
    val FLOAT_MAT2: Int get() = 0x8B5A
    val FLOAT_MAT3: Int get() = 0x8B5B
    val FLOAT_MAT4: Int get() = 0x8B5C
    val SAMPLER_2D: Int get() = 0x8B5E
    val SAMPLER_CUBE: Int get() = 0x8B60
    val VERTEX_ATTRIB_ARRAY_ENABLED: Int get() = 0x8622
    val VERTEX_ATTRIB_ARRAY_SIZE: Int get() = 0x8623
    val VERTEX_ATTRIB_ARRAY_STRIDE: Int get() = 0x8624
    val VERTEX_ATTRIB_ARRAY_TYPE: Int get() = 0x8625
    val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int get() = 0x886A
    val VERTEX_ATTRIB_ARRAY_POINTER: Int get() = 0x8645
    val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int get() = 0x889F
    val IMPLEMENTATION_COLOR_READ_TYPE: Int get() = 0x8B9A
    val IMPLEMENTATION_COLOR_READ_FORMAT: Int get() = 0x8B9B
    val COMPILE_STATUS: Int get() = 0x8B81
    val INFO_LOG_LENGTH: Int get() = 0x8B84
    val SHADER_SOURCE_LENGTH: Int get() = 0x8B88
    val SHADER_COMPILER: Int get() = 0x8DFA
    val SHADER_BINARY_FORMATS: Int get() = 0x8DF8
    val NUM_SHADER_BINARY_FORMATS: Int get() = 0x8DF9
    val LOW_FLOAT: Int get() = 0x8DF0
    val MEDIUM_FLOAT: Int get() = 0x8DF1
    val HIGH_FLOAT: Int get() = 0x8DF2
    val LOW_INT: Int get() = 0x8DF3
    val MEDIUM_INT: Int get() = 0x8DF4
    val HIGH_INT: Int get() = 0x8DF5
    val FRAMEBUFFER: Int get() = 0x8D40
    val RENDERBUFFER: Int get() = 0x8D41
    val RGBA4: Int get() = 0x8056
    val RGB5_A1: Int get() = 0x8057
    val RGB565: Int get() = 0x8D62
    val DEPTH_COMPONENT16: Int get() = 0x81A5
    val STENCIL_INDEX8: Int get() = 0x8D48
    val RENDERBUFFER_WIDTH: Int get() = 0x8D42
    val RENDERBUFFER_HEIGHT: Int get() = 0x8D43
    val RENDERBUFFER_INTERNAL_FORMAT: Int get() = 0x8D44
    val RENDERBUFFER_RED_SIZE: Int get() = 0x8D50
    val RENDERBUFFER_GREEN_SIZE: Int get() = 0x8D51
    val RENDERBUFFER_BLUE_SIZE: Int get() = 0x8D52
    val RENDERBUFFER_ALPHA_SIZE: Int get() = 0x8D53
    val RENDERBUFFER_DEPTH_SIZE: Int get() = 0x8D54
    val RENDERBUFFER_STENCIL_SIZE: Int get() = 0x8D55
    val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int get() = 0x8CD0
    val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int get() = 0x8CD1
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int get() = 0x8CD2
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int get() = 0x8CD3
    val COLOR_ATTACHMENT0: Int get() = 0x8CE0
    val DEPTH_ATTACHMENT: Int get() = 0x8D00
    val STENCIL_ATTACHMENT: Int get() = 0x8D20
    val NONE: Int get() = 0x0000
    val FRAMEBUFFER_COMPLETE: Int get() = 0x8CD5
    val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int get() = 0x8CD6
    val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int get() = 0x8CD7
    val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int get() = 0x8CD9
    val FRAMEBUFFER_UNSUPPORTED: Int get() = 0x8CDD
    val FRAMEBUFFER_BINDING: Int get() = 0x8CA6
    val RENDERBUFFER_BINDING: Int get() = 0x8CA7
    val MAX_RENDERBUFFER_SIZE: Int get() = 0x84E8
    val INVALID_FRAMEBUFFER_OPERATION: Int get() = 0x0506

    abstract fun activeTexture(texture: Int): Unit
    abstract fun attachShader(program: Int, shader: Int): Unit
    abstract fun bindAttribLocation(program: Int, index: Int, name: String): Unit
    abstract fun bindBuffer(target: Int, buffer: Int): Unit
    abstract fun bindFramebuffer(target: Int, framebuffer: Int): Unit
    abstract fun bindRenderbuffer(target: Int, renderbuffer: Int): Unit
    abstract fun bindTexture(target: Int, texture: Int): Unit
    abstract fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit
    abstract fun blendEquation(mode: Int): Unit
    abstract fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit
    abstract fun blendFunc(sfactor: Int, dfactor: Int): Unit
    abstract fun blendFuncSeparate(sfactorRGB: Int, dfactorRGB: Int, sfactorAlpha: Int, dfactorAlpha: Int): Unit
    abstract fun bufferData(target: Int, size: Int, data: KmlBuffer, usage: Int): Unit
    abstract fun bufferSubData(target: Int, offset: Int, size: Int, data: KmlBuffer): Unit
    abstract fun checkFramebufferStatus(target: Int): Int
    abstract fun clear(mask: Int): Unit
    abstract fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit
    abstract fun clearDepthf(d: Float): Unit
    abstract fun clearStencil(s: Int): Unit
    abstract fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit
    abstract fun compileShader(shader: Int): Unit
    abstract fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: KmlBuffer): Unit
    abstract fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: KmlBuffer): Unit
    abstract fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit
    abstract fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit
    abstract fun createProgram(): Int
    abstract fun createShader(type: Int): Int
    abstract fun cullFace(mode: Int): Unit
    abstract fun deleteBuffers(n: Int, items: KmlBuffer): Unit
    abstract fun deleteFramebuffers(n: Int, items: KmlBuffer): Unit
    abstract fun deleteProgram(program: Int): Unit
    abstract fun deleteRenderbuffers(n: Int, items: KmlBuffer): Unit
    abstract fun deleteShader(shader: Int): Unit
    abstract fun deleteTextures(n: Int, items: KmlBuffer): Unit
    abstract fun depthFunc(func: Int): Unit
    abstract fun depthMask(flag: Boolean): Unit
    abstract fun depthRangef(n: Float, f: Float): Unit
    abstract fun detachShader(program: Int, shader: Int): Unit
    abstract fun disable(cap: Int): Unit
    abstract fun disableVertexAttribArray(index: Int): Unit
    abstract fun drawArrays(mode: Int, first: Int, count: Int): Unit
    abstract fun drawElements(mode: Int, count: Int, type: Int, indices: Int): Unit
    abstract fun enable(cap: Int): Unit
    abstract fun enableVertexAttribArray(index: Int): Unit
    abstract fun finish(): Unit
    abstract fun flush(): Unit
    abstract fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Int): Unit
    abstract fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Int, level: Int): Unit
    abstract fun frontFace(mode: Int): Unit
    abstract fun genBuffers(n: Int, buffers: KmlBuffer): Unit
    abstract fun generateMipmap(target: Int): Unit
    abstract fun genFramebuffers(n: Int, framebuffers: KmlBuffer): Unit
    abstract fun genRenderbuffers(n: Int, renderbuffers: KmlBuffer): Unit
    abstract fun genTextures(n: Int, textures: KmlBuffer): Unit
    abstract fun getActiveAttrib(program: Int, index: Int, bufSize: Int, length: KmlBuffer, size: KmlBuffer, type: KmlBuffer, name: KmlBuffer): Unit
    abstract fun getActiveUniform(program: Int, index: Int, bufSize: Int, length: KmlBuffer, size: KmlBuffer, type: KmlBuffer, name: KmlBuffer): Unit
    abstract fun getAttachedShaders(program: Int, maxCount: Int, count: KmlBuffer, shaders: KmlBuffer): Unit
    abstract fun getAttribLocation(program: Int, name: String): Int
    abstract fun getBooleanv(pname: Int, data: KmlBuffer): Unit
    abstract fun getBufferParameteriv(target: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getError(): Int
    abstract fun getFloatv(pname: Int, data: KmlBuffer): Unit
    abstract fun getFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getIntegerv(pname: Int, data: KmlBuffer): Unit
    abstract fun getProgramiv(program: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getProgramInfoLog(program: Int, bufSize: Int, length: KmlBuffer, infoLog: KmlBuffer): Unit
    abstract fun getRenderbufferParameteriv(target: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getShaderiv(shader: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getShaderInfoLog(shader: Int, bufSize: Int, length: KmlBuffer, infoLog: KmlBuffer): Unit
    abstract fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int, range: KmlBuffer, precision: KmlBuffer): Unit
    abstract fun getShaderSource(shader: Int, bufSize: Int, length: KmlBuffer, source: KmlBuffer): Unit
    abstract fun getString(name: Int): String
    abstract fun getTexParameterfv(target: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getTexParameteriv(target: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getUniformfv(program: Int, location: Int, params: KmlBuffer): Unit
    abstract fun getUniformiv(program: Int, location: Int, params: KmlBuffer): Unit
    abstract fun getUniformLocation(program: Int, name: String): Int
    abstract fun getVertexAttribfv(index: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getVertexAttribiv(index: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun getVertexAttribPointerv(index: Int, pname: Int, pointer: KmlBuffer): Unit
    abstract fun hint(target: Int, mode: Int): Unit
    abstract fun isBuffer(buffer: Int): Boolean
    abstract fun isEnabled(cap: Int): Boolean
    abstract fun isFramebuffer(framebuffer: Int): Boolean
    abstract fun isProgram(program: Int): Boolean
    abstract fun isRenderbuffer(renderbuffer: Int): Boolean
    abstract fun isShader(shader: Int): Boolean
    abstract fun isTexture(texture: Int): Boolean
    abstract fun lineWidth(width: Float): Unit
    abstract fun linkProgram(program: Int): Unit
    abstract fun pixelStorei(pname: Int, param: Int): Unit
    abstract fun polygonOffset(factor: Float, units: Float): Unit
    abstract fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlBuffer): Unit
    abstract fun releaseShaderCompiler(): Unit
    abstract fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit
    abstract fun sampleCoverage(value: Float, invert: Boolean): Unit
    abstract fun scissor(x: Int, y: Int, width: Int, height: Int): Unit
    abstract fun shaderBinary(count: Int, shaders: KmlBuffer, binaryformat: Int, binary: KmlBuffer, length: Int): Unit
    abstract fun shaderSource(shader: Int, string: String): Unit
    abstract fun stencilFunc(func: Int, ref: Int, mask: Int): Unit
    abstract fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit
    abstract fun stencilMask(mask: Int): Unit
    abstract fun stencilMaskSeparate(face: Int, mask: Int): Unit
    abstract fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit
    abstract fun stencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int): Unit
    abstract fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: KmlBuffer): Unit
    abstract fun texParameterf(target: Int, pname: Int, param: Float): Unit
    abstract fun texParameterfv(target: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun texParameteri(target: Int, pname: Int, param: Int): Unit
    abstract fun texParameteriv(target: Int, pname: Int, params: KmlBuffer): Unit
    abstract fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: KmlBuffer): Unit
    abstract fun uniform1f(location: Int, v0: Float): Unit
    abstract fun uniform1fv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform1i(location: Int, v0: Int): Unit
    abstract fun uniform1iv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform2f(location: Int, v0: Float, v1: Float): Unit
    abstract fun uniform2fv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform2i(location: Int, v0: Int, v1: Int): Unit
    abstract fun uniform2iv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform3f(location: Int, v0: Float, v1: Float, v2: Float): Unit
    abstract fun uniform3fv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform3i(location: Int, v0: Int, v1: Int, v2: Int): Unit
    abstract fun uniform3iv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): Unit
    abstract fun uniform4fv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit
    abstract fun uniform4iv(location: Int, count: Int, value: KmlBuffer): Unit
    abstract fun uniformMatrix2fv(location: Int, count: Int, transpose: Boolean, value: KmlBuffer): Unit
    abstract fun uniformMatrix3fv(location: Int, count: Int, transpose: Boolean, value: KmlBuffer): Unit
    abstract fun uniformMatrix4fv(location: Int, count: Int, transpose: Boolean, value: KmlBuffer): Unit
    abstract fun useProgram(program: Int): Unit
    abstract fun validateProgram(program: Int): Unit
    abstract fun vertexAttrib1f(index: Int, x: Float): Unit
    abstract fun vertexAttrib1fv(index: Int, v: KmlBuffer): Unit
    abstract fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit
    abstract fun vertexAttrib2fv(index: Int, v: KmlBuffer): Unit
    abstract fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit
    abstract fun vertexAttrib3fv(index: Int, v: KmlBuffer): Unit
    abstract fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit
    abstract fun vertexAttrib4fv(index: Int, v: KmlBuffer): Unit
    abstract fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, pointer: Int): Unit
    abstract fun viewport(x: Int, y: Int, width: Int, height: Int): Unit
}
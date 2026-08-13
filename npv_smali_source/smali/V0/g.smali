.class public abstract LV0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM0/S;)Landroid/text/style/TtsSpan;
    .locals 1

    .prologue
    instance-of v0, p0, LM0/U;

    if-eqz v0, :cond_0

    check-cast p0, LM0/U;

    invoke-static {p0}, LV0/g;->b(LM0/U;)Landroid/text/style/TtsSpan;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method public static final b(LM0/U;)Landroid/text/style/TtsSpan;
    .locals 1

    new-instance v0, Landroid/text/style/TtsSpan$VerbatimBuilder;

    invoke-virtual {p0}, LM0/U;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    move-result-object p0

    return-object p0
.end method

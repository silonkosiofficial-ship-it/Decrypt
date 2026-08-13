.class public abstract LV0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Landroid/text/Spannable;LM0/x;IILY0/e;)V
    .locals 0

    .prologue
    const-class p1, Landroidx/emoji2/text/j;

    invoke-interface {p0, p2, p3, p1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    array-length p2, p1

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_0

    aget-object p4, p1, p3

    check-cast p4, Landroidx/emoji2/text/j;

    invoke-interface {p0, p4}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, LP0/j;

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(Landroid/text/Spannable;Ljava/util/List;LY0/e;)V
    .locals 5

    .prologue
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM0/d$c;

    invoke-virtual {v2}, LM0/d$c;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, LM0/d$c;->b()I

    move-result v3

    invoke-virtual {v2}, LM0/d$c;->c()I

    move-result v2

    const/4 v4, 0x0

    invoke-static {p0, v4, v3, v2, p2}, LV0/d;->a(Landroid/text/Spannable;LM0/x;IILY0/e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.class public abstract LU0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LU0/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU0/c$a;

    invoke-direct {v0}, LU0/c$a;-><init>()V

    sput-object v0, LU0/c;->a:LU0/c$a;

    return-void
.end method

.method public static final a(Ljava/lang/String;FLM0/P;Ljava/util/List;Ljava/util/List;LY0/e;Lx7/r;Z)Ljava/lang/CharSequence;
    .locals 8

    .prologue
    const/4 v0, 0x0

    if-eqz p7, :cond_2

    invoke-static {}, Landroidx/emoji2/text/f;->k()Z

    move-result p7

    if-eqz p7, :cond_2

    invoke-virtual {p2}, LM0/P;->w()LM0/A;

    move-result-object p7

    if-eqz p7, :cond_0

    invoke-virtual {p7}, LM0/A;->a()LM0/y;

    move-result-object p7

    if-eqz p7, :cond_0

    invoke-virtual {p7}, LM0/y;->b()I

    move-result p7

    invoke-static {p7}, LM0/g;->d(I)LM0/g;

    move-result-object p7

    goto :goto_0

    :cond_0
    const/4 p7, 0x0

    :goto_0
    sget-object v1, LM0/g;->b:LM0/g$a;

    invoke-virtual {v1}, LM0/g$a;->a()I

    move-result v1

    if-nez p7, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p7}, LM0/g;->j()I

    move-result p7

    invoke-static {p7, v1}, LM0/g;->g(II)Z

    move-result p7

    move v6, p7

    :goto_1
    invoke-static {}, Landroidx/emoji2/text/f;->c()Landroidx/emoji2/text/f;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const v5, 0x7fffffff

    const/4 v3, 0x0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Landroidx/emoji2/text/f;->u(Ljava/lang/CharSequence;IIII)Ljava/lang/CharSequence;

    move-result-object p7

    invoke-static {p7}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move-object p7, p0

    :goto_2
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, LM0/P;->D()LX0/r;

    move-result-object v1

    sget-object v2, LX0/r;->c:LX0/r$a;

    invoke-virtual {v2}, LX0/r$a;->a()LX0/r;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, LM0/P;->s()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/y;->g(J)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object p7

    :cond_3
    instance-of v1, p7, Landroid/text/Spannable;

    if-eqz v1, :cond_4

    check-cast p7, Landroid/text/Spannable;

    goto :goto_3

    :cond_4
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, p7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p7, v1

    :goto_3
    invoke-virtual {p2}, LM0/P;->A()LX0/k;

    move-result-object v1

    sget-object v2, LX0/k;->b:LX0/k$a;

    invoke-virtual {v2}, LX0/k$a;->d()LX0/k;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, LU0/c;->a:LU0/c$a;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {p7, v1, v0, p0}, LV0/e;->u(Landroid/text/Spannable;Ljava/lang/Object;II)V

    :cond_5
    invoke-static {p2}, LU0/c;->b(LM0/P;)Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {p2}, LM0/P;->t()LX0/h;

    move-result-object p0

    if-nez p0, :cond_6

    invoke-virtual {p2}, LM0/P;->s()J

    move-result-wide v0

    invoke-static {p7, v0, v1, p1, p5}, LV0/e;->r(Landroid/text/Spannable;JFLY0/e;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, LM0/P;->t()LX0/h;

    move-result-object p0

    if-nez p0, :cond_7

    sget-object p0, LX0/h;->c:LX0/h$b;

    invoke-virtual {p0}, LX0/h$b;->a()LX0/h;

    move-result-object p0

    :cond_7
    move-object v7, p0

    invoke-virtual {p2}, LM0/P;->s()J

    move-result-wide v3

    move-object v2, p7

    move v5, p1

    move-object v6, p5

    invoke-static/range {v2 .. v7}, LV0/e;->q(Landroid/text/Spannable;JFLY0/e;LX0/h;)V

    :goto_4
    invoke-virtual {p2}, LM0/P;->D()LX0/r;

    move-result-object p0

    invoke-static {p7, p0, p1, p5}, LV0/e;->y(Landroid/text/Spannable;LX0/r;FLY0/e;)V

    invoke-static {p7, p2, p3, p5, p6}, LV0/e;->w(Landroid/text/Spannable;LM0/P;Ljava/util/List;LY0/e;Lx7/r;)V

    invoke-static {p7, p4, p5}, LV0/d;->b(Landroid/text/Spannable;Ljava/util/List;LY0/e;)V

    return-object p7
.end method

.method public static final b(LM0/P;)Z
    .locals 0

    .prologue
    invoke-virtual {p0}, LM0/P;->w()LM0/A;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LM0/A;->a()LM0/y;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LM0/y;->c()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

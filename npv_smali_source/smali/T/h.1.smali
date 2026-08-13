.class public abstract LT/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;)LT/k;
    .locals 8

    new-instance v0, LS8/o;

    const-string v1, "[^dMy/\\-.]"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, LS8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, LS8/o;

    const-string v1, "d{1,2}"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const-string v1, "dd"

    invoke-virtual {v0, p0, v1}, LS8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, LS8/o;

    const-string v1, "M{1,2}"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const-string v1, "MM"

    invoke-virtual {v0, p0, v1}, LS8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, LS8/o;

    const-string v1, "y{1,4}"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const-string v1, "yyyy"

    invoke-virtual {v0, p0, v1}, LS8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "My"

    const-string v4, "M/y"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "."

    invoke-static {p0, v0}, LS8/r;->K0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, LS8/o;

    const-string v1, "[/\\-.]"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, LS8/o;->b(LS8/o;Ljava/lang/CharSequence;IILjava/lang/Object;)LS8/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, LS8/l;->c()LS8/k;

    move-result-object v0

    invoke-interface {v0, v3}, LS8/k;->get(I)LS8/j;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LS8/j;->a()LE7/i;

    move-result-object v0

    invoke-virtual {v0}, LE7/g;->f()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LT/k;

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {v1, p0, v0}, LT/k;-><init>(Ljava/lang/String;C)V

    return-object v1
.end method

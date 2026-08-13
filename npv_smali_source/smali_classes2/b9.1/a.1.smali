.class public abstract Lb9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lb9/D;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb9/a;->a:Lb9/D;

    return-void
.end method

.method public static final synthetic a()Lb9/D;
    .locals 1

    sget-object v0, Lb9/a;->a:Lb9/D;

    return-object v0
.end method

.method public static final b(Lb9/b;)Lb9/b;
    .locals 2

    .prologue
    :cond_0
    :goto_0
    invoke-static {p0}, Lb9/b;->b(Lb9/b;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lb9/a;->a()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    check-cast v0, Lb9/b;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lb9/b;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_2
    move-object p0, v0

    goto :goto_0
.end method

.method public static final c(Lb9/A;JLx7/p;)Ljava/lang/Object;
    .locals 4

    .prologue
    :cond_0
    :goto_0
    iget-wide v0, p0, Lb9/A;->c:J

    cmp-long v0, v0, p1

    if-ltz v0, :cond_2

    invoke-virtual {p0}, Lb9/A;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lb9/B;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {p0}, Lb9/b;->b(Lb9/b;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lb9/a;->a()Lb9/D;

    move-result-object v1

    if-ne v0, v1, :cond_3

    sget-object p0, Lb9/a;->a:Lb9/D;

    invoke-static {p0}, Lb9/B;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    check-cast v0, Lb9/b;

    check-cast v0, Lb9/A;

    if-eqz v0, :cond_5

    :cond_4
    :goto_2
    move-object p0, v0

    goto :goto_0

    :cond_5
    iget-wide v0, p0, Lb9/A;->c:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb9/A;

    invoke-virtual {p0, v0}, Lb9/b;->o(Lb9/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb9/A;->k()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lb9/b;->n()V

    goto :goto_2
.end method

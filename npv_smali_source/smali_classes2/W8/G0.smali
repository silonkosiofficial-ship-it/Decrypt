.class public abstract LW8/G0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lb9/D;

.field public static final b:Lb9/D;

.field private static final c:Lb9/D;

.field private static final d:Lb9/D;

.field private static final e:Lb9/D;

.field private static final f:LW8/i0;

.field private static final g:LW8/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb9/D;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LW8/G0;->a:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LW8/G0;->b:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LW8/G0;->c:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LW8/G0;->d:Lb9/D;

    new-instance v0, Lb9/D;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lb9/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LW8/G0;->e:Lb9/D;

    new-instance v0, LW8/i0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW8/i0;-><init>(Z)V

    sput-object v0, LW8/G0;->f:LW8/i0;

    new-instance v0, LW8/i0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LW8/i0;-><init>(Z)V

    sput-object v0, LW8/G0;->g:LW8/i0;

    return-void
.end method

.method public static final synthetic a()Lb9/D;
    .locals 1

    sget-object v0, LW8/G0;->a:Lb9/D;

    return-object v0
.end method

.method public static final synthetic b()Lb9/D;
    .locals 1

    sget-object v0, LW8/G0;->c:Lb9/D;

    return-object v0
.end method

.method public static final synthetic c()LW8/i0;
    .locals 1

    sget-object v0, LW8/G0;->g:LW8/i0;

    return-object v0
.end method

.method public static final synthetic d()LW8/i0;
    .locals 1

    sget-object v0, LW8/G0;->f:LW8/i0;

    return-object v0
.end method

.method public static final synthetic e()Lb9/D;
    .locals 1

    sget-object v0, LW8/G0;->e:Lb9/D;

    return-object v0
.end method

.method public static final synthetic f()Lb9/D;
    .locals 1

    sget-object v0, LW8/G0;->d:Lb9/D;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p0, LW8/v0;

    if-eqz v0, :cond_0

    new-instance v0, LW8/w0;

    check-cast p0, LW8/v0;

    invoke-direct {v0, p0}, LW8/w0;-><init>(LW8/v0;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    instance-of v0, p0, LW8/w0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LW8/w0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, LW8/w0;->a:LW8/v0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method

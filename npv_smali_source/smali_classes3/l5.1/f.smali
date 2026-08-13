.class public final Ll5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll5/f$a;
    }
.end annotation


# static fields
.field public static final e:Ll5/f$a;

.field private static f:Z


# instance fields
.field public final a:Ll5/e;

.field public final b:Ll5/e;

.field public final c:Ll5/e;

.field public final d:Ll5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll5/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll5/f$a;-><init>(Ly7/k;)V

    sput-object v0, Ll5/f;->e:Ll5/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const-string v0, "backgroundExecutorService"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockingExecutorService"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll5/e;

    invoke-direct {v0, p1}, Ll5/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Ll5/f;->a:Ll5/e;

    new-instance v0, Ll5/e;

    invoke-direct {v0, p1}, Ll5/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Ll5/f;->b:Ll5/e;

    new-instance v0, Ll5/e;

    invoke-direct {v0, p1}, Ll5/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Ll5/f;->c:Ll5/e;

    new-instance p1, Ll5/e;

    invoke-direct {p1, p2}, Ll5/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object p1, p0, Ll5/f;->d:Ll5/e;

    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    sget-boolean v0, Ll5/f;->f:Z

    return v0
.end method

.method public static final synthetic b(Z)V
    .locals 0

    sput-boolean p0, Ll5/f;->f:Z

    return-void
.end method

.method public static final c()V
    .locals 1

    sget-object v0, Ll5/f;->e:Ll5/f$a;

    invoke-virtual {v0}, Ll5/f$a;->e()V

    return-void
.end method

.method public static final d()V
    .locals 1

    sget-object v0, Ll5/f;->e:Ll5/f$a;

    invoke-virtual {v0}, Ll5/f$a;->f()V

    return-void
.end method

.method public static final e()V
    .locals 1

    sget-object v0, Ll5/f;->e:Ll5/f$a;

    invoke-virtual {v0}, Ll5/f$a;->g()V

    return-void
.end method

.method public static final f(Z)V
    .locals 1

    sget-object v0, Ll5/f;->e:Ll5/f$a;

    invoke-virtual {v0, p0}, Ll5/f$a;->n(Z)V

    return-void
.end method

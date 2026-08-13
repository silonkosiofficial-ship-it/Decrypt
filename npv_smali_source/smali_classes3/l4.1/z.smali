.class final Ll4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/h;
.implements Ll4/g;
.implements Ll4/e;
.implements Ll4/K;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ll4/c;

.field private final c:Ll4/P;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll4/c;Ll4/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/z;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll4/z;->b:Ll4/c;

    iput-object p3, p0, Ll4/z;->c:Ll4/P;

    return-void
.end method

.method static bridge synthetic e(Ll4/z;)Ll4/c;
    .locals 0

    iget-object p0, p0, Ll4/z;->b:Ll4/c;

    return-object p0
.end method

.method static bridge synthetic f(Ll4/z;)Ll4/P;
    .locals 0

    iget-object p0, p0, Ll4/z;->c:Ll4/P;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll4/z;->c:Ll4/P;

    invoke-virtual {v0, p1}, Ll4/P;->s(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Ll4/z;->c:Ll4/P;

    invoke-virtual {v0}, Ll4/P;->t()Z

    return-void
.end method

.method public final c(Ll4/l;)V
    .locals 1

    new-instance v0, Ll4/y;

    invoke-direct {v0, p0, p1}, Ll4/y;-><init>(Ll4/z;Ll4/l;)V

    iget-object p1, p0, Ll4/z;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ll4/z;->c:Ll4/P;

    invoke-virtual {v0, p1}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void
.end method

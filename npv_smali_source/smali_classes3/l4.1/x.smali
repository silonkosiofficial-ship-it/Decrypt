.class final Ll4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/K;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ll4/c;

.field private final c:Ll4/P;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll4/c;Ll4/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/x;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll4/x;->b:Ll4/c;

    iput-object p3, p0, Ll4/x;->c:Ll4/P;

    return-void
.end method

.method static bridge synthetic a(Ll4/x;)Ll4/c;
    .locals 0

    iget-object p0, p0, Ll4/x;->b:Ll4/c;

    return-object p0
.end method

.method static bridge synthetic b(Ll4/x;)Ll4/P;
    .locals 0

    iget-object p0, p0, Ll4/x;->c:Ll4/P;

    return-object p0
.end method


# virtual methods
.method public final c(Ll4/l;)V
    .locals 1

    new-instance v0, Ll4/w;

    invoke-direct {v0, p0, p1}, Ll4/w;-><init>(Ll4/x;Ll4/l;)V

    iget-object p1, p0, Ll4/x;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

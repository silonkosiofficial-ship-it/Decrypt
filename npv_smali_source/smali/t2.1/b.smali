.class public abstract Lt2/b;
.super Lh2/L;
.source "SourceFile"


# instance fields
.field private final b:Lo2/u;

.field private final c:Lo2/n;

.field private final d:Lt2/a;


# direct methods
.method public varargs constructor <init>(Lo2/u;Lo2/n;[Ljava/lang/String;)V
    .locals 1

    const-string v0, "sourceQuery"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "db"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tables"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lh2/L;-><init>()V

    iput-object p1, p0, Lt2/b;->b:Lo2/u;

    iput-object p2, p0, Lt2/b;->c:Lo2/n;

    new-instance p1, Lt2/a;

    new-instance p2, Lt2/b$a;

    invoke-direct {p2, p0}, Lt2/b$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {p1, p3, p0, p2}, Lt2/a;-><init>([Ljava/lang/String;Lt2/b;Lx7/q;)V

    iput-object p1, p0, Lt2/b;->d:Lt2/a;

    return-void
.end method

.method static synthetic m(Lt2/b;Lh2/L$a;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lt2/b;->d:Lt2/a;

    invoke-virtual {p0, p1, p2}, Lt2/a;->j(Lh2/L$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic d(Lh2/M;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt2/b;->k(Lh2/M;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public f(Lh2/L$a;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lt2/b;->m(Lt2/b;Lh2/L$a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract i(Lo2/u;ILm7/e;)Ljava/lang/Object;
.end method

.method public final j()Lo2/n;
    .locals 1

    iget-object v0, p0, Lt2/b;->c:Lo2/n;

    return-object v0
.end method

.method public k(Lh2/M;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lu2/a;->a(Lh2/M;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final l()Lo2/u;
    .locals 1

    iget-object v0, p0, Lt2/b;->b:Lo2/u;

    return-object v0
.end method

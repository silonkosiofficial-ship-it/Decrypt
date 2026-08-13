.class public final LB3/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LD3/a;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:I

.field private final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(LD3/a;Ljava/lang/String;JI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, LB3/n0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, LB3/n0;->a:LD3/a;

    iput-object p2, p0, LB3/n0;->b:Ljava/lang/String;

    iput-wide p3, p0, LB3/n0;->c:J

    iput p5, p0, LB3/n0;->d:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LB3/n0;->d:I

    return v0
.end method

.method public final b()LD3/a;
    .locals 1

    iget-object v0, p0, LB3/n0;->a:LD3/a;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LB3/n0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LB3/n0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final e()Z
    .locals 4

    .prologue
    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v0

    iget-wide v2, p0, LB3/n0;->c:J

    cmp-long v0, v2, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LB3/n0;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

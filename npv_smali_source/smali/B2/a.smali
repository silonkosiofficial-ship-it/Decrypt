.class public final LB2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/b;


# instance fields
.field private final a:J

.field private volatile b:Z


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LB2/a;->a:J

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .prologue
    iget-boolean v0, p0, LB2/a;->b:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, LB2/a;->a:J

    invoke-static {v0, v1}, Landroidx/sqlite/driver/bundled/BundledSQLiteConnectionKt;->a(J)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LB2/a;->b:Z

    return-void
.end method

.method public e(Ljava/lang/String;)Ly2/e;
    .locals 4

    .prologue
    const-string v0, "sql"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LB2/a;->b:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, LB2/a;->a:J

    invoke-static {v0, v1, p1}, Landroidx/sqlite/driver/bundled/BundledSQLiteConnectionKt;->b(JLjava/lang/String;)J

    move-result-wide v0

    new-instance p1, LB2/c;

    iget-wide v2, p0, LB2/a;->a:J

    invoke-direct {p1, v2, v3, v0, v1}, LB2/c;-><init>(JJ)V

    return-object p1

    :cond_0
    const/16 p1, 0x15

    const-string v0, "connection is closed"

    invoke-static {p1, v0}, Ly2/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance p1, Li7/k;

    invoke-direct {p1}, Li7/k;-><init>()V

    throw p1
.end method

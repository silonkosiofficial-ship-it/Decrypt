.class public final synthetic Lf3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Lf3/r;

.field public final synthetic b:LY2/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lf3/r;LY2/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/q;->a:Lf3/r;

    iput-object p2, p0, Lf3/q;->b:LY2/p;

    iput-wide p3, p0, Lf3/q;->c:J

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lf3/q;->a:Lf3/r;

    iget-object v1, p0, Lf3/q;->b:LY2/p;

    iget-wide v2, p0, Lf3/q;->c:J

    invoke-static {v0, v1, v2, v3}, Lf3/r;->g(Lf3/r;LY2/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

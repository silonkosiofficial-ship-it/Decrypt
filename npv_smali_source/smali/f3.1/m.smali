.class public final synthetic Lf3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Lf3/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:LY2/p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lf3/r;Ljava/lang/Iterable;LY2/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/m;->a:Lf3/r;

    iput-object p2, p0, Lf3/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lf3/m;->c:LY2/p;

    iput-wide p4, p0, Lf3/m;->d:J

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lf3/m;->a:Lf3/r;

    iget-object v1, p0, Lf3/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lf3/m;->c:LY2/p;

    iget-wide v3, p0, Lf3/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lf3/r;->b(Lf3/r;Ljava/lang/Iterable;LY2/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

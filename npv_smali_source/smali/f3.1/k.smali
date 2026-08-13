.class public final synthetic Lf3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Lf3/r;

.field public final synthetic b:LY2/p;


# direct methods
.method public synthetic constructor <init>(Lf3/r;LY2/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/k;->a:Lf3/r;

    iput-object p2, p0, Lf3/k;->b:LY2/p;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf3/k;->a:Lf3/r;

    iget-object v1, p0, Lf3/k;->b:LY2/p;

    invoke-static {v0, v1}, Lf3/r;->d(Lf3/r;LY2/p;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

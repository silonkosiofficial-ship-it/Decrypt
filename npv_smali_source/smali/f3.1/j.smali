.class public final synthetic Lf3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/b$a;


# instance fields
.field public final synthetic a:Lf3/r;

.field public final synthetic b:LY2/p;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lf3/r;LY2/p;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/j;->a:Lf3/r;

    iput-object p2, p0, Lf3/j;->b:LY2/p;

    iput p3, p0, Lf3/j;->c:I

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lf3/j;->a:Lf3/r;

    iget-object v1, p0, Lf3/j;->b:LY2/p;

    iget v2, p0, Lf3/j;->c:I

    invoke-static {v0, v1, v2}, Lf3/r;->f(Lf3/r;LY2/p;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

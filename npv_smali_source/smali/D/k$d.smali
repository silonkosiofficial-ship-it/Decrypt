.class public final LD/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/k;->g(ILx7/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LD/k;

.field final synthetic b:Ly7/O;

.field final synthetic c:I


# direct methods
.method constructor <init>(LD/k;Ly7/O;I)V
    .locals 0

    iput-object p1, p0, LD/k$d;->a:LD/k;

    iput-object p2, p0, LD/k$d;->b:Ly7/O;

    iput p3, p0, LD/k$d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    iget-object v0, p0, LD/k$d;->a:LD/k;

    iget-object v1, p0, LD/k$d;->b:Ly7/O;

    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, LD/j$a;

    iget v2, p0, LD/k$d;->c:I

    invoke-static {v0, v1, v2}, LD/k;->j(LD/k;LD/j$a;I)Z

    move-result v0

    return v0
.end method

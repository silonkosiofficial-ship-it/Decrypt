.class final Laa/f$e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f$e;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I

.field final synthetic E:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    iput p1, p0, Laa/f$e$a;->D:I

    iput p2, p0, Laa/f$e$a;->E:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Laa/e;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laa/e$a;

    iget v1, p0, Laa/f$e$a;->D:I

    iget v2, p0, Laa/f$e$a;->E:I

    invoke-static {p1, v1, v2}, Laa/g;->a([BII)Lo0/E1;

    move-result-object p1

    invoke-direct {v0, p1}, Laa/e$a;-><init>(Lo0/E1;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Laa/f$e$a;->a([B)Laa/e;

    move-result-object p1

    return-object p1
.end method

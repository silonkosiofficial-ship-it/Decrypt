.class final LB/E$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/E;->c(IILV/n;II)LB/D;
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

    iput p1, p0, LB/E$b;->D:I

    iput p2, p0, LB/E$b;->E:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LB/D;
    .locals 3

    new-instance v0, LB/D;

    iget v1, p0, LB/E$b;->D:I

    iget v2, p0, LB/E$b;->E:I

    invoke-direct {v0, v1, v2}, LB/D;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB/E$b;->a()LB/D;

    move-result-object v0

    return-object v0
.end method

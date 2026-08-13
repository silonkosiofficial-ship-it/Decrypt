.class final LV/y$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/y;->b([LV/P0;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:[LV/P0;

.field final synthetic E:Lx7/p;

.field final synthetic F:I


# direct methods
.method constructor <init>([LV/P0;Lx7/p;I)V
    .locals 0

    iput-object p1, p0, LV/y$a;->D:[LV/P0;

    iput-object p2, p0, LV/y$a;->E:Lx7/p;

    iput p3, p0, LV/y$a;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 2

    iget-object p2, p0, LV/y$a;->D:[LV/P0;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [LV/P0;

    iget-object v0, p0, LV/y$a;->E:Lx7/p;

    iget v1, p0, LV/y$a;->F:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LV/S0;->a(I)I

    move-result v1

    invoke-static {p2, v0, p1, v1}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LV/y$a;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

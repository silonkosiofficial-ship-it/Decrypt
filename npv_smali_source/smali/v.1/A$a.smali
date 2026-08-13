.class final Lv/A$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/A;->T1()LD0/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:Lv/A;


# direct methods
.method constructor <init>(Ly7/O;Lv/A;)V
    .locals 0

    iput-object p1, p0, Lv/A$a;->D:Ly7/O;

    iput-object p2, p0, Lv/A$a;->E:Lv/A;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lv/A$a;->D:Ly7/O;

    iget-object v1, p0, Lv/A$a;->E:Lv/A;

    invoke-static {}, LD0/W;->a()LV/O0;

    move-result-object v2

    invoke-static {v1, v2}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv/A$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.class public final Lv/D;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/D$a;
    }
.end annotation


# static fields
.field public static final R:Lv/D$a;

.field public static final S:I


# instance fields
.field private P:Lx7/l;

.field private final Q:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv/D$a;-><init>(Ly7/k;)V

    sput-object v0, Lv/D;->R:Lv/D$a;

    const/16 v0, 0x8

    sput v0, Lv/D;->S:I

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lv/D;->P:Lx7/l;

    sget-object p1, Lv/D;->R:Lv/D$a;

    iput-object p1, p0, Lv/D;->Q:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv/D;->Q:Ljava/lang/Object;

    return-object v0
.end method

.method public final T1(LD0/t;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lv/D;->P:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LF0/F0;->b(LF0/E0;)LF0/E0;

    move-result-object v0

    check-cast v0, Lv/D;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lv/D;->T1(LD0/t;)V

    :cond_0
    return-void
.end method

.class public abstract Lu0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lu0/l;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lq0/g;)V
.end method

.method public b()Lx7/l;
    .locals 1

    iget-object v0, p0, Lu0/l;->a:Lx7/l;

    return-object v0
.end method

.method public final c()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lu0/l;->b()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public d(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lu0/l;->a:Lx7/l;

    return-void
.end method

.class public abstract Lz0/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LD0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b()LD0/t;
    .locals 1

    iget-object v0, p0, Lz0/H;->a:LD0/t;

    return-object v0
.end method

.method public abstract c()Z
.end method

.method public abstract d()V
.end method

.method public abstract e(Lz0/p;Lz0/r;J)V
.end method

.method public final f(LD0/t;)V
    .locals 0

    iput-object p1, p0, Lz0/H;->a:LD0/t;

    return-void
.end method

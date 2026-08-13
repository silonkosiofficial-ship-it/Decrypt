.class public final LB/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/K;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/Map;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LB/E$a;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LB/E$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, LB/E$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LB/E$a;->a:I

    return v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public synthetic l()Lx7/l;
    .locals 1

    invoke-static {p0}, LD0/J;->a(LD0/K;)Lx7/l;

    move-result-object v0

    return-object v0
.end method

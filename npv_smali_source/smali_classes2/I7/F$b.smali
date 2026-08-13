.class public abstract LI7/F$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# static fields
.field private static final C:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/F$b$a;

    invoke-direct {v0}, LI7/F$b$a;-><init>()V

    sput-object v0, LI7/F$b;->C:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    if-nez p1, :cond_0

    sget-object p1, LI7/F$b;->C:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public abstract b()Ljava/lang/Object;
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LI7/F$b;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    sget-object v0, LI7/F$b;->C:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

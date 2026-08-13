.class public final Lu/v$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/v$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lu/v$a$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lu/v$a$a;)[F
    .locals 0

    invoke-direct {p0}, Lu/v$a$a;->b()[F

    move-result-object p0

    return-object p0
.end method

.method private final b()[F
    .locals 1

    .prologue
    invoke-static {}, Lu/v$a;->a()[F

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lu/v$a;->a()[F

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const/16 v0, 0x5b

    new-array v0, v0, [F

    invoke-static {v0}, Lu/v$a;->b([F)V

    invoke-static {}, Lu/v$a;->a()[F

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

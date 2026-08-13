.class public abstract LH/X;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz0/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3f0

    invoke-static {v0}, Lz0/z;->a(I)Lz0/w;

    move-result-object v0

    sput-object v0, LH/X;->a:Lz0/w;

    return-void
.end method

.method public static final a()Lz0/w;
    .locals 1

    sget-object v0, LH/X;->a:Lz0/w;

    return-object v0
.end method

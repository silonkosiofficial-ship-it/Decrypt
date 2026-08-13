.class public final Lu0/h$b;
.super Lu0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lu0/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu0/h$b;

    invoke-direct {v0}, Lu0/h$b;-><init>()V

    sput-object v0, Lu0/h$b;->c:Lu0/h$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lu0/h;-><init>(ZZILy7/k;)V

    return-void
.end method

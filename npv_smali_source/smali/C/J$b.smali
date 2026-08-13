.class final LC/J$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:LC/J$b;

.field private static b:I

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC/J$b;

    invoke-direct {v0}, LC/J$b;-><init>()V

    sput-object v0, LC/J$b;->a:LC/J$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    sput p1, LC/J$b;->b:I

    return-void
.end method

.method public b(I)V
    .locals 0

    sput p1, LC/J$b;->c:I

    return-void
.end method

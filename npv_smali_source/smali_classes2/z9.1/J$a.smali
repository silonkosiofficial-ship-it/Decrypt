.class final Lz9/J$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz9/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:Lz9/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/J$a;

    invoke-direct {v0}, Lz9/J$a;-><init>()V

    sput-object v0, Lz9/J$a;->a:Lz9/J$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.class public final LR7/A$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR7/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LR7/A$a;

.field private static final b:LO7/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR7/A$a;

    invoke-direct {v0}, LR7/A$a;-><init>()V

    sput-object v0, LR7/A$a;->a:LR7/A$a;

    new-instance v0, LO7/F;

    const-string v1, "PackageViewDescriptorFactory"

    invoke-direct {v0, v1}, LO7/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LR7/A$a;->b:LO7/F;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LO7/F;
    .locals 1

    sget-object v0, LR7/A$a;->b:LO7/F;

    return-object v0
.end method

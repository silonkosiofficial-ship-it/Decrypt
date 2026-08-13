.class public final LU0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU0/n;


# static fields
.field public static final a:LU0/m;

.field private static b:LU0/n;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU0/m;

    invoke-direct {v0}, LU0/m;-><init>()V

    sput-object v0, LU0/m;->a:LU0/m;

    new-instance v0, LU0/k;

    invoke-direct {v0}, LU0/k;-><init>()V

    sput-object v0, LU0/m;->b:LU0/n;

    const/16 v0, 0x8

    sput v0, LU0/m;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LV/G1;
    .locals 1

    sget-object v0, LU0/m;->b:LU0/n;

    invoke-interface {v0}, LU0/n;->a()LV/G1;

    move-result-object v0

    return-object v0
.end method

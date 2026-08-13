.class public final LK0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK0/s;

.field private static final b:LK0/v;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LK0/s;

    invoke-direct {v0}, LK0/s;-><init>()V

    sput-object v0, LK0/s;->a:LK0/s;

    new-instance v0, LK0/v;

    const/4 v1, 0x0

    sget-object v2, LK0/s$a;->D:LK0/s$a;

    const-string v3, "TestTagsAsResourceId"

    invoke-direct {v0, v3, v1, v2}, LK0/v;-><init>(Ljava/lang/String;ZLx7/p;)V

    sput-object v0, LK0/s;->b:LK0/v;

    const/16 v0, 0x8

    sput v0, LK0/s;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LK0/v;
    .locals 1

    sget-object v0, LK0/s;->b:LK0/v;

    return-object v0
.end method

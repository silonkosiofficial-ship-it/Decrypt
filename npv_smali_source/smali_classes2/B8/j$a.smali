.class public final LB8/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LB8/j$a;

.field private static final b:LB8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LB8/j$a;

    invoke-direct {v0}, LB8/j$a;-><init>()V

    sput-object v0, LB8/j$a;->a:LB8/j$a;

    new-instance v0, LB8/j$a$a;

    invoke-direct {v0}, LB8/j$a$a;-><init>()V

    sput-object v0, LB8/j$a;->b:LB8/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LB8/j;
    .locals 1

    sget-object v0, LB8/j$a;->b:LB8/j;

    return-object v0
.end method

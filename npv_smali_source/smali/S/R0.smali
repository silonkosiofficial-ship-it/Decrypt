.class public final LS/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/R0;

.field private static final b:LG/a;

.field private static final c:LG/a;

.field private static final d:LG/a;

.field private static final e:LG/a;

.field private static final f:LG/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/R0;

    invoke-direct {v0}, LS/R0;-><init>()V

    sput-object v0, LS/R0;->a:LS/R0;

    sget-object v0, LU/A;->a:LU/A;

    invoke-virtual {v0}, LU/A;->b()LG/f;

    move-result-object v1

    sput-object v1, LS/R0;->b:LG/a;

    invoke-virtual {v0}, LU/A;->e()LG/f;

    move-result-object v1

    sput-object v1, LS/R0;->c:LG/a;

    invoke-virtual {v0}, LU/A;->d()LG/f;

    move-result-object v1

    sput-object v1, LS/R0;->d:LG/a;

    invoke-virtual {v0}, LU/A;->c()LG/f;

    move-result-object v1

    sput-object v1, LS/R0;->e:LG/a;

    invoke-virtual {v0}, LU/A;->a()LG/f;

    move-result-object v0

    sput-object v0, LS/R0;->f:LG/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LG/a;
    .locals 1

    sget-object v0, LS/R0;->f:LG/a;

    return-object v0
.end method

.method public final b()LG/a;
    .locals 1

    sget-object v0, LS/R0;->b:LG/a;

    return-object v0
.end method

.method public final c()LG/a;
    .locals 1

    sget-object v0, LS/R0;->e:LG/a;

    return-object v0
.end method

.method public final d()LG/a;
    .locals 1

    sget-object v0, LS/R0;->d:LG/a;

    return-object v0
.end method

.method public final e()LG/a;
    .locals 1

    sget-object v0, LS/R0;->c:LG/a;

    return-object v0
.end method

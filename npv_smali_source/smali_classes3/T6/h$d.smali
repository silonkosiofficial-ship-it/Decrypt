.class public final LT6/h$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:LT6/h$d;

.field private static final b:LT6/h;

.field private static final c:LT6/h;

.field private static final d:LT6/h;

.field private static final e:LT6/h;

.field private static final f:LT6/h;

.field private static final g:LT6/h;

.field private static final h:LT6/h;

.field private static final i:LT6/h;

.field private static final j:LT6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, LT6/h$d;

    invoke-direct {v0}, LT6/h$d;-><init>()V

    sput-object v0, LT6/h$d;->a:LT6/h$d;

    new-instance v0, LT6/h;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "text"

    const-string v3, "*"

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->b:LT6/h;

    new-instance v0, LT6/h;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "text"

    const-string v9, "plain"

    const/4 v10, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->c:LT6/h;

    new-instance v0, LT6/h;

    const-string v2, "text"

    const-string v3, "css"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->d:LT6/h;

    new-instance v0, LT6/h;

    const-string v8, "text"

    const-string v9, "csv"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->e:LT6/h;

    new-instance v0, LT6/h;

    const-string v2, "text"

    const-string v3, "html"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->f:LT6/h;

    new-instance v0, LT6/h;

    const-string v8, "text"

    const-string v9, "javascript"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->g:LT6/h;

    new-instance v0, LT6/h;

    const-string v2, "text"

    const-string v3, "vcard"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->h:LT6/h;

    new-instance v0, LT6/h;

    const-string v8, "text"

    const-string v9, "xml"

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->i:LT6/h;

    new-instance v0, LT6/h;

    const-string v2, "text"

    const-string v3, "event-stream"

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LT6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILy7/k;)V

    sput-object v0, LT6/h$d;->j:LT6/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT6/h;
    .locals 1

    sget-object v0, LT6/h$d;->j:LT6/h;

    return-object v0
.end method

.method public final b()LT6/h;
    .locals 1

    sget-object v0, LT6/h$d;->c:LT6/h;

    return-object v0
.end method

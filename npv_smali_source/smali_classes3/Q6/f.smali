.class public final LQ6/f;
.super La7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ6/f$a;
    }
.end annotation


# static fields
.field public static final g:LQ6/f$a;

.field private static final h:La7/i;

.field private static final i:La7/i;

.field private static final j:La7/i;

.field private static final k:La7/i;

.field private static final l:La7/i;


# instance fields
.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ6/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ6/f$a;-><init>(Ly7/k;)V

    sput-object v0, LQ6/f;->g:LQ6/f$a;

    new-instance v0, La7/i;

    const-string v1, "Receive"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LQ6/f;->h:La7/i;

    new-instance v0, La7/i;

    const-string v1, "Parse"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LQ6/f;->i:La7/i;

    new-instance v0, La7/i;

    const-string v1, "Transform"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LQ6/f;->j:La7/i;

    new-instance v0, La7/i;

    const-string v1, "State"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LQ6/f;->k:La7/i;

    new-instance v0, La7/i;

    const-string v1, "After"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LQ6/f;->l:La7/i;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [La7/i;

    sget-object v1, LQ6/f;->h:La7/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LQ6/f;->i:La7/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LQ6/f;->j:La7/i;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LQ6/f;->k:La7/i;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LQ6/f;->l:La7/i;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, La7/d;-><init>([La7/i;)V

    iput-boolean p1, p0, LQ6/f;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILy7/k;)V
    .locals 0

    .prologue
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, LQ6/f;-><init>(Z)V

    return-void
.end method

.method public static final synthetic s()La7/i;
    .locals 1

    sget-object v0, LQ6/f;->i:La7/i;

    return-object v0
.end method

.method public static final synthetic t()La7/i;
    .locals 1

    sget-object v0, LQ6/f;->h:La7/i;

    return-object v0
.end method

.method public static final synthetic u()La7/i;
    .locals 1

    sget-object v0, LQ6/f;->j:La7/i;

    return-object v0
.end method


# virtual methods
.method public g()Z
    .locals 1

    iget-boolean v0, p0, LQ6/f;->f:Z

    return v0
.end method

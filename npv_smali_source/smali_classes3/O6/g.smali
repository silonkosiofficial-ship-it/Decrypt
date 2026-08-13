.class public final LO6/g;
.super La7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO6/g$a;
    }
.end annotation


# static fields
.field public static final g:LO6/g$a;

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

    new-instance v0, LO6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO6/g$a;-><init>(Ly7/k;)V

    sput-object v0, LO6/g;->g:LO6/g$a;

    new-instance v0, La7/i;

    const-string v1, "Before"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LO6/g;->h:La7/i;

    new-instance v0, La7/i;

    const-string v1, "State"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LO6/g;->i:La7/i;

    new-instance v0, La7/i;

    const-string v1, "Transform"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LO6/g;->j:La7/i;

    new-instance v0, La7/i;

    const-string v1, "Render"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LO6/g;->k:La7/i;

    new-instance v0, La7/i;

    const-string v1, "Send"

    invoke-direct {v0, v1}, La7/i;-><init>(Ljava/lang/String;)V

    sput-object v0, LO6/g;->l:La7/i;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [La7/i;

    sget-object v1, LO6/g;->h:La7/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LO6/g;->i:La7/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LO6/g;->j:La7/i;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LO6/g;->k:La7/i;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LO6/g;->l:La7/i;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, La7/d;-><init>([La7/i;)V

    iput-boolean p1, p0, LO6/g;->f:Z

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
    invoke-direct {p0, p1}, LO6/g;-><init>(Z)V

    return-void
.end method

.method public static final synthetic s()La7/i;
    .locals 1

    sget-object v0, LO6/g;->h:La7/i;

    return-object v0
.end method

.method public static final synthetic t()La7/i;
    .locals 1

    sget-object v0, LO6/g;->k:La7/i;

    return-object v0
.end method

.method public static final synthetic u()La7/i;
    .locals 1

    sget-object v0, LO6/g;->l:La7/i;

    return-object v0
.end method


# virtual methods
.method public g()Z
    .locals 1

    iget-boolean v0, p0, LO6/g;->f:Z

    return v0
.end method

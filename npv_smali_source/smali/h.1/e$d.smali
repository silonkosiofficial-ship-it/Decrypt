.class final Lh/e$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/e;->h()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lh/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh/e$d;

    invoke-direct {v0}, Lh/e$d;-><init>()V

    sput-object v0, Lh/e$d;->D:Lh/e$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    sget-object v0, LC7/c;->C:LC7/c$a;

    const/high16 v1, 0x7fff0000

    invoke-virtual {v0, v1}, LC7/c$a;->c(I)I

    move-result v0

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh/e$d;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

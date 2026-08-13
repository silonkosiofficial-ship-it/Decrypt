.class final LM0/D$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM0/D;->h(LM0/C;)LM0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/D$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/D$a;

    invoke-direct {v0}, LM0/D$a;-><init>()V

    sput-object v0, LM0/D$a;->D:LM0/D$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LX0/o;
    .locals 1

    invoke-static {}, LM0/D;->a()LX0/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM0/D$a;->a()LX0/o;

    move-result-object v0

    return-object v0
.end method

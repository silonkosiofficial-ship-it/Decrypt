.class final LV/E$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV/E;-><init>(Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LV/E$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV/E$a;

    invoke-direct {v0}, LV/E$a;-><init>()V

    sput-object v0, LV/E$a;->D:LV/E$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    const-string v0, "Unexpected call to default provider"

    invoke-static {v0}, LV/q;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0
.end method

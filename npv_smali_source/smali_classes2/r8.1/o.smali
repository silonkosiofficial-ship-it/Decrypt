.class public abstract Lr8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LO7/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LO7/F;

    const-string v1, "ResolutionAnchorProvider"

    invoke-direct {v0, v1}, LO7/F;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr8/o;->a:LO7/F;

    return-void
.end method

.method public static final a(LO7/G;)LO7/G;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr8/o;->a:LO7/F;

    invoke-interface {p0, v0}, LO7/G;->q0(LO7/F;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method
